package br.com.topsorteio.dtos;

import lombok.NoArgsConstructor;

import java.util.Date;


public record TurmaResponseDTO(Integer id, String nome, boolean participando_sorteio, Date criadoem) {
}
