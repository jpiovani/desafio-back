create table tbl_sintomas
(
    id                    bigint generated by default as IDENTITY ,
    nome                  varchar(50) NOT NULL,
    primary key (id)
);

create table tbl_habitos
(
    id                    bigint generated by default as IDENTITY ,
    nome                  varchar(50) NOT NULL,
    primary key (id)
);

create table tbl_exames
(
    id                    bigint generated by default as IDENTITY ,
    nome                  varchar(50) NOT NULL,
    primary key (id)
);

create table tbl_paciente
(
    id_paciente           bigint generated by default as IDENTITY ,
    nome                  varchar(50) NOT NULL,
    cpf                   numeric(11) NOT NULL,
    convenio              varchar(20) NOT NULL,
    cep                   numeric(8) NOT NULL,
    endereco              varchar(20) NOT NULL,
    numero                numeric(7) NOT NULL,
    bairro                varchar(30) NOT NULL,
    ddd                   numeric(3) NOT NULL,
    celular               numeric(9) NOT NULL,
    primary key (id_paciente)
);

create table tbl_funcoesVitais
(
    id                    bigint generated by default as IDENTITY ,
    temperatura           varchar(5) NOT NULL,
    pressaoArterial       varchar(5) NOT NULL,
    batimentosCardiacos   varchar(5) NOT NULL,
    tbl_paciente int not null,
    primary key (id),
    foreign key (tbl_paciente) references tbl_paciente(id_paciente)
);

create table tbl_analiseClinica
(
    id_analise_clinica    bigint generated by default as IDENTITY ,
    dataAnalise           date NOT NULL,
    tbl_sintomas          int not null,
    tbl_habitos          int not null,
    tbl_exames          int not null,
    tbl_paciente int not null,
    primary key (id_analise_clinica),
    foreign key (tbl_paciente) references tbl_paciente(id_paciente),
    foreign key (tbl_sintomas) references tbl_sintomas(id),
    foreign key (tbl_habitos) references tbl_habitos(id),
    foreign key (tbl_exames) references tbl_exames(id)
);

