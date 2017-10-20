CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
	nome VARCHAR(50) NOT NULL,
	logradouro VARCHAR(50),
	numero VARCHAR(30),
	complemento VARCHAR(30),
	bairro VARCHAR(30),
	cep VARCHAR(30),
	cidade VARCHAR(30),
	estado VARCHAR(30),
	ativo BOOLEAN NOT NULL 
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO pessoa (nome, logradouro, numero, bairro, cep, cidade, estado, ativo) values ('Esmael Gonçalves', 'Rua Pedro Dias', '46', 'Vila Nogueira', '09960-330', 'Diadema', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('Tatiane Mestezk', 'Rua Pedro Dias', '46', 'Casa 2', 'Vila Nogueira', '09960-330', 'Diadema', 'São Paulo', true);
INSERT INTO pessoa (nome, logradouro, numero, complemento, bairro, cep, cidade, estado, ativo) values ('João', 'Rua Dom Marcos de Noronha', '291', 'Casa 2', 'Bairro Nuevo', '09960-190', 'Diadema', 'São Paulo', false);

