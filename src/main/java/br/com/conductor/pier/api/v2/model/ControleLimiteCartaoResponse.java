package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o de resposta do recurso de controle de limites
 **/
@ApiModel(description = "Representa\u00E7\u00E3o de resposta do recurso de controle de limites")
public class ControleLimiteCartaoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idCartao")
  private Long idCartao = null;
  @SerializedName("limiteMensal")
  private BigDecimal limiteMensal = null;
  @SerializedName("saldoDisponivelMensal")
  private BigDecimal saldoDisponivelMensal = null;
  @SerializedName("limiteSemanal")
  private BigDecimal limiteSemanal = null;
  @SerializedName("saldoDisponivelSemanal")
  private BigDecimal saldoDisponivelSemanal = null;
  @SerializedName("limiteDiario")
  private BigDecimal limiteDiario = null;
  @SerializedName("saldoDisponivelDiario")
  private BigDecimal saldoDisponivelDiario = null;
  @SerializedName("dataHoraUltimaCompra")
  private String dataHoraUltimaCompra = null;
  @SerializedName("ativo")
  private Boolean ativo = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do controle de limites (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do controle de limites (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id do cart\u00E3o
   **/
  @ApiModelProperty(value = "Id do cart\u00E3o")
  public Long getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(Long idCartao) {
    this.idCartao = idCartao;
  }

  
  /**
   * Valor do limite mensal
   **/
  @ApiModelProperty(value = "Valor do limite mensal")
  public BigDecimal getLimiteMensal() {
    return limiteMensal;
  }
  public void setLimiteMensal(BigDecimal limiteMensal) {
    this.limiteMensal = limiteMensal;
  }

  
  /**
   * Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar no m\u00EAs
   **/
  @ApiModelProperty(value = "Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar no m\u00EAs")
  public BigDecimal getSaldoDisponivelMensal() {
    return saldoDisponivelMensal;
  }
  public void setSaldoDisponivelMensal(BigDecimal saldoDisponivelMensal) {
    this.saldoDisponivelMensal = saldoDisponivelMensal;
  }

  
  /**
   * Valor do limite semanal
   **/
  @ApiModelProperty(value = "Valor do limite semanal")
  public BigDecimal getLimiteSemanal() {
    return limiteSemanal;
  }
  public void setLimiteSemanal(BigDecimal limiteSemanal) {
    this.limiteSemanal = limiteSemanal;
  }

  
  /**
   * Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar na semana
   **/
  @ApiModelProperty(value = "Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar na semana")
  public BigDecimal getSaldoDisponivelSemanal() {
    return saldoDisponivelSemanal;
  }
  public void setSaldoDisponivelSemanal(BigDecimal saldoDisponivelSemanal) {
    this.saldoDisponivelSemanal = saldoDisponivelSemanal;
  }

  
  /**
   * Valor do limite di\u00E1rio
   **/
  @ApiModelProperty(value = "Valor do limite di\u00E1rio")
  public BigDecimal getLimiteDiario() {
    return limiteDiario;
  }
  public void setLimiteDiario(BigDecimal limiteDiario) {
    this.limiteDiario = limiteDiario;
  }

  
  /**
   * Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar no dia
   **/
  @ApiModelProperty(value = "Valor dispon\u00EDvel que o cart\u00E3o ainda pode gastar no dia")
  public BigDecimal getSaldoDisponivelDiario() {
    return saldoDisponivelDiario;
  }
  public void setSaldoDisponivelDiario(BigDecimal saldoDisponivelDiario) {
    this.saldoDisponivelDiario = saldoDisponivelDiario;
  }

  
  /**
   * Data e hora da \u00FAltima compra realizada pelo cart\u00E3o
   **/
  @ApiModelProperty(value = "Data e hora da \u00FAltima compra realizada pelo cart\u00E3o")
  public String getDataHoraUltimaCompra() {
    return dataHoraUltimaCompra;
  }
  public void setDataHoraUltimaCompra(String dataHoraUltimaCompra) {
    this.dataHoraUltimaCompra = dataHoraUltimaCompra;
  }

  
  /**
   * Flag que mostra se a configura\u00E7\u00E3o est\u00E1 ativa
   **/
  @ApiModelProperty(value = "Flag que mostra se a configura\u00E7\u00E3o est\u00E1 ativa")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleLimiteCartaoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  limiteMensal: ").append(limiteMensal).append("\n");
    sb.append("  saldoDisponivelMensal: ").append(saldoDisponivelMensal).append("\n");
    sb.append("  limiteSemanal: ").append(limiteSemanal).append("\n");
    sb.append("  saldoDisponivelSemanal: ").append(saldoDisponivelSemanal).append("\n");
    sb.append("  limiteDiario: ").append(limiteDiario).append("\n");
    sb.append("  saldoDisponivelDiario: ").append(saldoDisponivelDiario).append("\n");
    sb.append("  dataHoraUltimaCompra: ").append(dataHoraUltimaCompra).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
