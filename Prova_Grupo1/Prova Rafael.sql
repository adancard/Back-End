-- Cria o banco de dados "prova"
CREATE DATABASE senai_banco_academico;

-- Utiliza o banco de dados "prova"
USE senai_banco_academico;

-- tabela disciplina
CREATE TABLE disciplina (
    sigla VARCHAR(15) PRIMARY KEY,
    nome VARCHAR(40) NOT NULL,
    ementa TEXT
);

-- tabela professor
CREATE TABLE professor (
    codigo VARCHAR(15),
    nome VARCHAR(40) NOT NULL,
    codigo_disciplina VARCHAR(15) NOT NULL,
    especialidade VARCHAR(50) NOT NULL,
    data_admissao DATE NOT NULL,
    PRIMARY KEY(codigo, codigo_disciplina),
    CONSTRAINT fk_professor_disciplina FOREIGN KEY (codigo_disciplina) REFERENCES disciplina(sigla) ON DELETE CASCADE ON UPDATE CASCADE
);


-- Inserção das disciplinas na tabela disciplina
INSERT INTO disciplina (sigla, nome, ementa) VALUES
('PWBE', 'Programação Web para Back-End', 'Tal disciplina aborda conceitos e técnicas para desenvolvimento de aplicativos web no lado do servidor, com foco em back-end.'),
('PWFE', 'Programação Web para Front-End', 'Esta disciplina explora as tecnologias e práticas para desenvolvimento de aplicações web com foco em front-end.'),
('IDM', 'Interface para Dispositivos Móveis', 'A disciplina aborda projetar e desenvolver interfaces de usuário para aplicativos móveis, com foco nos princípios de design e usabilidade.'),
('BD', 'Banco de Dados', 'Esta disciplina contempla conceitos fundamentais de bancos de dados, modelagem de dados e linguagens de consulta SQL.'),
('REDES', 'Redes de Computadores', 'A disciplina aborda conceitos introdutórios sobre redes de computadores, topologias e padrões.'),
('SO', 'Sistemas Operacionais', 'A disciplina contempla conceitos fundamentais sobre sistemas operacionais, apresentando as funcionalidades dos sistemas operacionais baseados nas plataformas Windows e Linux.');






-- Inserção dos professores na tabela professor
INSERT INTO professor (codigo, nome, codigo_disciplina, especialidade, data_admissao) VALUES
(101, 'Eduardo Nascimento', 'PWFE', 'Tecnologia da Informação', '2023-01-15'),
(101, 'Eduardo Nascimento', 'BD', 'Tecnologia da Informação', '2023-01-15'),
(102, 'Matheus Michilino', 'IDM', 'Mecatrônica e Interfaces Robóticas', '2020-01-01'),
(103, 'Rafael Selvagio', 'PWBE', 'Tecnologia da Informação', '2023-06-01'),
(104, 'Rafael Rizzi', 'REDES', 'Eng. Elétrica', '2022-01-01');



