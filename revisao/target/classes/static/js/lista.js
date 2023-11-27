function gerarRelatorio() {
	fetch('http://localhost:8080/pdf/gerar')
		.then(response => {
			if (!response.ok) {
				throw new Error('Erro ao gerar relatório');
			}
			// Se a resposta estiver ok, você pode redirecionar ou realizar outras ações necessárias
			// Por exemplo, você pode abrir o relatório em uma nova janela
			window.open('http://localhost:8080/pdf/gerar');
		})
		.catch(error => {
			console.error('Erro:', error);
			// Aqui você pode exibir uma mensagem de erro para o usuário, se desejar
			Swal.fire({
				icon: 'error',
				title: 'Erro',
				text: 'Erro ao gerar relatório',
			});
		});
}

function buscaTodos() {
	fetch('http://localhost:8080/cadastro')
		.then(response => {
			if (!response.ok) {
				throw new Error('Erro ao buscar países');
			}
			return response.json();
		})
		.then(data => {
			const tabelaElement = document.getElementById('tabela_lista');

			// Limpar todas as linhas da tabela
			while (tabelaElement.firstChild) {
				tabelaElement.removeChild(tabelaElement.firstChild);
			}

			// Criar uma nova linha na tabela
			const row = document.createElement('tr');

			// Criar células na linha para cada propriedade do país
			const cellNome = document.createElement('th');
			cellNome.textContent = "Código";
			row.appendChild(cellNome);

			const cellCapital = document.createElement('th');
			cellCapital.textContent = "Nome";
			row.appendChild(cellCapital);

			const cellSigla2 = document.createElement('th');
			cellSigla2.textContent = "Idade";
			row.appendChild(cellSigla2);

			const cellSigla3 = document.createElement('th');
			cellSigla3.textContent = "Rua";
			row.appendChild(cellSigla3);


			tabelaElement.appendChild(row);

			// Criar elementos de lista (li) para cada país
			data.forEach(cadastro => {
				// Criar uma nova linha na tabela
				const row = document.createElement('tr');

				// Criar células na linha para cada propriedade do país
				const cellCodigo = document.createElement('td');
				cellCodigo.textContent = cadastro.codigo;
				row.appendChild(cellCodigo);

				const cellNome = document.createElement('td');
				cellNome.textContent = cadastro.nome;
				row.appendChild(cellNome);

				const cellIdade = document.createElement('td');
				cellIdade.textContent = cadastro.idade;
				row.appendChild(cellIdade);

				const cellCep = document.createElement('td');
				cellCep.textContent = cadastro.cep;
				row.appendChild(cellCep);

				// Adicionar a linha à tabela
				tabelaElement.appendChild(row);
			});
		})
		.catch(error => {
			console.error('Erro:', error);
		});
}

// Função executada ao terminar o load da página
window.onload = buscaTodos;