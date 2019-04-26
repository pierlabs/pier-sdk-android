package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de requisi\u00E7\u00E3o do agendamento 
 **/
@ApiModel(description = "Objeto de requisi\u00E7\u00E3o do agendamento ")
public class AgendamentoPersist  {
  
  @SerializedName("tipoOperacao")
  private Integer tipoOperacao = null;
  @SerializedName("tipoRecorrencia")
  private Integer tipoRecorrencia = null;
  @SerializedName("quantidadeAgendamento")
  private Integer quantidadeAgendamento = null;
  @SerializedName("diaRecorrencia")
  private Integer diaRecorrencia = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("sort")
  private List<String> sort = null;

  
  /**
   * Tipo opera\u00E7\u00E3o 
   **/
  @ApiModelProperty(value = "Tipo opera\u00E7\u00E3o ")
  public Integer getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(Integer tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * Tipo Recorr\u00EAncia
   **/
  @ApiModelProperty(value = "Tipo Recorr\u00EAncia")
  public Integer getTipoRecorrencia() {
    return tipoRecorrencia;
  }
  public void setTipoRecorrencia(Integer tipoRecorrencia) {
    this.tipoRecorrencia = tipoRecorrencia;
  }

  
  /**
   * Quantidade agendamento 
   **/
  @ApiModelProperty(value = "Quantidade agendamento ")
  public Integer getQuantidadeAgendamento() {
    return quantidadeAgendamento;
  }
  public void setQuantidadeAgendamento(Integer quantidadeAgendamento) {
    this.quantidadeAgendamento = quantidadeAgendamento;
  }

  
  /**
   * Dia recorr\u00EAncia
   **/
  @ApiModelProperty(value = "Dia recorr\u00EAncia")
  public Integer getDiaRecorrencia() {
    return diaRecorrencia;
  }
  public void setDiaRecorrencia(Integer diaRecorrencia) {
    this.diaRecorrencia = diaRecorrencia;
  }

  
  /**
   * Valor Agendamento
   **/
  @ApiModelProperty(value = "Valor Agendamento")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Tipo de ordena\u00E7\u00E3o dos registros
   **/
  @ApiModelProperty(value = "Tipo de ordena\u00E7\u00E3o dos registros")
  public List<String> getSort() {
    return sort;
  }
  public void setSort(List<String> sort) {
    this.sort = sort;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgendamentoPersist {\n");
    
    sb.append("  tipoOperacao: ").append(tipoOperacao).append("\n");
    sb.append("  tipoRecorrencia: ").append(tipoRecorrencia).append("\n");
    sb.append("  quantidadeAgendamento: ").append(quantidadeAgendamento).append("\n");
    sb.append("  diaRecorrencia: ").append(diaRecorrencia).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  sort: ").append(sort).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
