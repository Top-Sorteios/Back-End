package br.com.topsorteio.dtos;


public record SorteioResquestDTO(Boolean sorteio_surpresa, String email_autenticado, String codigo_sku) {
}
