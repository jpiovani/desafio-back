ALTER TABLE tbl_paciente ALTER COLUMN cep TYPE varchar(14);
ALTER TABLE tbl_paciente ALTER COLUMN numero TYPE varchar(7);
ALTER TABLE tbl_analise_clinica RENAME COLUMN dataAnalise TO data_analise;
ALTER TABLE tbl_funcoes_vitais RENAME COLUMN pressaoArterial TO pressao_arterial;
ALTER TABLE tbl_funcoes_vitais RENAME COLUMN batimentosCardiacos TO batimentos_cardiacos;