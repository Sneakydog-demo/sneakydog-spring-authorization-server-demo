insert into users (user_id, user_name, password)
values ('1', 'user', '{bcrypt}$2a$10$A9s9a8vEioKjoUyJ5nDYS.BdBd.btA2bWUfi2/bcfsIohJ.St2nz.');



insert into oauth2_registered_client (id, client_id, client_id_issued_at, client_secret, client_secret_expires_at,
                                      client_name, client_authentication_methods, authorization_grant_types,
                                      redirect_uris, scopes, client_settings, token_settings)
values ('11111', 'test', '2021-11-26 10:54:35', '{bcrypt}$2a$10$WqO0R2ZehN0DqCHQYPmmaua4GFBWxBYJxEidtltNeaH.Pwe/Kt5eC',
        null, '11111', 'client_secret_post,client_secret_basic', 'refresh_token,client_credentials,authorization_code',
        'http://127.0.0.1:9090/login/oauth2/code/demo', 'openid',
        '{"@class":"java.util.Collections$UnmodifiableMap","settings.client.require-proof-key":false,"settings.client.require-authorization-consent":false}',
        '{"@class":"java.util.Collections$UnmodifiableMap","settings.token.reuse-refresh-tokens":true,"settings.token.id-token-signature-algorithm":["org.springframework.security.oauth2.jose.jws.SignatureAlgorithm","RS256"],"settings.token.access-token-time-to-live":["java.time.Duration",300.000000000],"settings.token.refresh-token-time-to-live":["java.time.Duration",3600.000000000]}');
