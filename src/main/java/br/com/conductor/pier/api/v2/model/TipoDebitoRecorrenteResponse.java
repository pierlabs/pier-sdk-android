package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso de Tipo Debito Recorrente
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de Tipo Debito Recorrente")
public class TipoDebitoRecorrenteResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id).
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo de d\u00E9bito recorrente (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente.
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do tipo de d\u00E9bito recorrente.")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Valor do tipo de d\u00E9bito recorrente.
   **/
  @ApiModelProperty(value = "Valor do tipo de d\u00E9bito recorrente.")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Flag que identifica se o tipo d\u00E9bito recorrente est\u00E1 ativo.
   **/
  @ApiModelProperty(value = "Flag que identifica se o tipo d\u00E9bito recorrente est\u00E1 ativo.")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoDebitoRecorrenteResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
