package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Classe AgendamentoResponse
 **/
@ApiModel(description = "Classe AgendamentoResponse")
public class AgendamentoResponse  {
  
  @SerializedName("idAgendamento")
  private Long idAgendamento = null;
  @SerializedName("dataCriacao")
  private String dataCriacao = null;
  @SerializedName("idConta")
  private Integer idConta = null;
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
  @SerializedName("status")
  private Integer status = null;

  
  /**
   * ID do Agendamento criado
   **/
  @ApiModelProperty(value = "ID do Agendamento criado")
  public Long getIdAgendamento() {
    return idAgendamento;
  }
  public void setIdAgendamento(Long idAgendamento) {
    this.idAgendamento = idAgendamento;
  }

  
  /**
   * Data de Cria\u00E7\u00E3o do Agendamento
   **/
  @ApiModelProperty(value = "Data de Cria\u00E7\u00E3o do Agendamento")
  public String getDataCriacao() {
    return dataCriacao;
  }
  public void setDataCriacao(String dataCriacao) {
    this.dataCriacao = dataCriacao;
  }

  
  /**
   * ID da Conta do Portador
   **/
  @ApiModelProperty(value = "ID da Conta do Portador")
  public Integer getIdConta() {
    return idConta;
  }
  public void setIdConta(Integer idConta) {
    this.idConta = idConta;
  }

  
  /**
   * ID da Conta do Portador
   **/
  @ApiModelProperty(value = "ID da Conta do Portador")
  public Integer getTipoOperacao() {
    return tipoOperacao;
  }
  public void setTipoOperacao(Integer tipoOperacao) {
    this.tipoOperacao = tipoOperacao;
  }

  
  /**
   * Tipo de Recorrencia da Recarga (Mensal, Diaria, etc)
   **/
  @ApiModelProperty(value = "Tipo de Recorrencia da Recarga (Mensal, Diaria, etc)")
  public Integer getTipoRecorrencia() {
    return tipoRecorrencia;
  }
  public void setTipoRecorrencia(Integer tipoRecorrencia) {
    this.tipoRecorrencia = tipoRecorrencia;
  }

  
  /**
   * Quantidade que este agendamento ser\u00E1 repetido
   **/
  @ApiModelProperty(value = "Quantidade que este agendamento ser\u00E1 repetido")
  public Integer getQuantidadeAgendamento() {
    return quantidadeAgendamento;
  }
  public void setQuantidadeAgendamento(Integer quantidadeAgendamento) {
    this.quantidadeAgendamento = quantidadeAgendamento;
  }

  
  /**
   * Dia de recorrencia deste agendamento
   **/
  @ApiModelProperty(value = "Dia de recorrencia deste agendamento")
  public Integer getDiaRecorrencia() {
    return diaRecorrencia;
  }
  public void setDiaRecorrencia(Integer diaRecorrencia) {
    this.diaRecorrencia = diaRecorrencia;
  }

  
  /**
   * Valor do agendamento
   **/
  @ApiModelProperty(value = "Valor do agendamento")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Status atual do Agendamento
   **/
  @ApiModelProperty(value = "Status atual do Agendamento")
  public Integer getStatus() {
    return status;
  }
  public void setStatus(Integer status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgendamentoResponse {\n");
    
    sb.append("  idAgendamento: ").append(idAgendamento).append("\n");
    sb.append("  dataCriacao: ").append(dataCriacao).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  tipoOperacao: ").append(tipoOperacao).append("\n");
    sb.append("  tipoRecorrencia: ").append(tipoRecorrencia).append("\n");
    sb.append("  quantidadeAgendamento: ").append(quantidadeAgendamento).append("\n");
    sb.append("  diaRecorrencia: ").append(diaRecorrencia).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
