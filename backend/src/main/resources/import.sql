INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992000317','guaianazes@maurocenter.com.br',2,49,'');
INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992000155','nfedeposito@maurocenter.com.br',2,675,'');
INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992000589','aricanduva@maurocenter.com.br',2,4800,'');
INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992000821','saomateus@maurocenter.com.br',2,3528,'');
INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992001046','suzano2@maurocenter.com.br',2,280,'');
INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992001470','guarulhos@maurocenter.com.br',2,2800,'');
INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992001801','itaim@maurocenter.com.br',2,6490,'');
INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992001984','penha@maurocenter.com.br',2,3192,'');
INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992001712','mogi@maurocenter.com.br',2,279,'');
INSERT INTO tb_client(name, document, email, type, number, complement) VALUES ('MAURO COMERCIO DE PISOS E CABAMENTOS LTDA','54026992002018','suzano@maurocenter.com.br',2,279,'');

INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Rua Luis Mateus','Guaianazes','São Paulo','SP','08420750',1);
INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Rua Luis Mateus','Guaianazes','São Paulo', 'SP','08420750',2);
INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Avenida Aricanduva','Jardim Aricanduva','São Paulo','SP','03490000',3);
INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Avenida Ragueb Chofi','Jardim Três Marias','São Paulo','SP','08341410',4);
INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Avenida Francisco Marengo','Jardim Revista','Suzano','SP','08694000',5);
INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Estrada Presidente Juscelino Kubitschek de Oliveira','Parque São Miguel','Guarulhos','SP','07260000',6);
INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Avenida Marechal Tito','Itaim Paulista','São Paulo','SP','08115000',7);
INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Avenida São Miguel','Vila Rio Branco','São Paulo','SP','03870000',8);
INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Avenida Francisco Ferreira Lopes','Vila Lavínia','Mogi das Cruzes','SP','08735200',9);
INSERT INTO tb_address (name_street, district, city, state, cep, client_id) VALUES ('Rua Prudente de Moraes','Centro','Suzano','SP','08674015',10);
INSERT INTO tb_address (name_street, district, city, state, cep, provider_id) VALUES ();
INSERT INTO tb_address (name_street, district, city, state, cep, provider_id) VALUES ();
INSERT INTO tb_address (name_street, district, city, state, cep, provider_id) VALUES ();
INSERT INTO tb_address (name_street, district, city, state, cep, provider_id) VALUES ();




INSERT INTO tb_provider(corporate_name, fantasy_name, social_register, email, name_street, number, district, city, state, cep, phone) VALUES ('fornecedor teste1','test1','111222555664','teste1@gmail.com','Rua raes',279,'Centro','Suzano','SP','08674015','5511555588');
INSERT INTO tb_provider(corporate_name, fantasy_name, social_register, email, name_street, number, district, city, state, cep, phone) VALUES ('fornecedor teste2','test2','111222555664','teste2@gmail.com','Rua Prues',9,'Centro','Suzano','SP','08674015','5511555588');
INSERT INTO tb_provider(corporate_name, fantasy_name, social_register, email, name_street, number, district, city, state, cep, phone) VALUES ('fornecedor teste3','test3','111222555664','teste3@gmail.com','Rua aes',7,'Centro','Suzano','SP','08674015','5511555588');
INSERT INTO tb_provider(corporate_name, fantasy_name, social_register, email, name_street, number, district, city, state, cep, phone) VALUES ('fornecedor teste4','test4','111222555664','teste4@gmail.com','Rua dente ',79,'Centro','Suzano','SP','08674015','5511555588');


INSERT INTO tb_product(name, barcode, quantity_est, date_validity, price, paking, provider_id) VALUES ('Café' ,'7896089012453',2,'2022-08-14T10:00:00Z',5.55,4, 1);
INSERT INTO tb_product(name, barcode, quantity_est, date_validity, price, paking, provider_id) VALUES ('Café' ,'7896089012453',10,'2022-08-14T10:00:00Z',5.55,4, 1);

INSERT INTO tb_order(moment,status,client_id) VALUES (NOW(),2,1);

INSERT INTO tb_order_item(order_id,product_id,quantity,price) VALUES (1,1,2,5.55);