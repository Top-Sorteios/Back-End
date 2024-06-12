| METODO | LINK | PERMISSAO |
|-----|------|-----------|
| POST | https://modulo-sorteios.azurewebsites.net/usuarios/registrar | X |
| PUT | https://modulo-sorteios.azurewebsites.net/usuarios/primeiro-acesso | X |
| POST| https://modulo-sorteios.azurewebsites.net/usuarios/login | X |
| POST| https://modulo-sorteios.azurewebsites.net/usuarios/esqueci-senha | X |
| GET | https://modulo-sorteios.azurewebsites.net/usuarios/obter | ADMIN |
| GET | https://modulo-sorteios.azurewebsites.net/usuarios/obter/{email} | USER |
| PUT | https://modulo-sorteios.azurewebsites.net/usuarios/editar/senha/{email} | USER |
| GET | https://modulo-sorteios.azurewebsites.net/usuarios/helloworld | X |

| MÉTODO | LINK | PERMISSÃO |
|-----|------|-----------|
| POST | localhost:8080/marcas/registrar | ADMIN |
| GET | localhost:8080/marcas/obter | ADMIN |
| GET| localhost:8080/marcas/obter/{id} | ADMIN |
| PUT| localhost:8080/marcas/editar/{id} | ADMIN |
| DELETE | localhost:8080/marcas/{id} | ADMIN |


<b>Formato Requisições</b>

| POST | https://modulo-sorteios.azurewebsites.net/usuarios/registrar | X |

```console
{
	"nome": "string",
   	 "cpf": "string",
   	 "email": "string",
   	 "datanascimento": "string", //exemplo:"AAAA/MM/DD"
   	 "turma": "string",
   	 "status": "string",
   	 "administrador": "string", //USER ou ADMIN
	"criadopor": 2, //aqui é passado o id de um admin, pode ultilizar o 2 que é um id de admin
```

https://modulo-sorteios.azurewebsites.net/usuarios/primeiro-acesso

```console
{
	"email": string, 
	"cpf": string,  
	"datanascimento": string, //exemplo:"AAAA/MM/DD"
 	"senha": string,		
}
```

https://modulo-sorteios.azurewebsites.net/usuarios/login

```console
{
	"email": string, 
	"senha": string,  
}
```

https://modulo-sorteios.azurewebsites.net/usuarios/senha/{email}

```console
{
	"senhaAtual": string, 
	"senha": string,  
}
```

https://modulo-sorteios.azurewebsites.net/usuarios/esqueci-senha

```console
{
	"email": string 
}
```
| POST | localhost:8080/marcas/registrar

```console
{
    "nome": string,
    "titulo": string, 
    "logo": null, // byte array
    "banner": null, // byte array
    "ordemExibicao": int,
    "criadoPor": Integer
}
```

| PUT | localhost:8080/marcas/editar/{id}

``` console
{
    "nome": string,
    "titulo": string, 
    "logo": null,
    "banner": null,
    "ordemExibicao": int
}
```