package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{transferencia_detalhe_response_description}}}
 **/
@ApiModel(description = "{{{transferencia_detalhe_response_description}}}")
public class TransferenciaDetalheResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("dataTransferencia")
  private String dataTransferencia = null;
  @SerializedName("idContaOrigem")
  private Long idContaOrigem = null;
  @SerializedName("nomePessoaOrigem")
  private String nomePessoaOrigem = null;
  @SerializedName("idContaDestino")
  private Long idContaDestino = null;
  @SerializedName("nomePessoaDestino")
  private String nomePessoaDestino = null;
  @SerializedName("valorTransferencia")
  private BigDecimal valorTransferencia = null;
  @SerializedName("valorTarifa")
  private BigDecimal valorTarifa = null;

  
  /**
   * {{{transferencia_detalhe_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_detalhe_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{transferencia_detalhe_response_data_transferencia_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_detalhe_response_data_transferencia_value}}}")
  public String getDataTransferencia() {
    return dataTransferencia;
  }
  public void setDataTransferencia(String dataTransferencia) {
    this.dataTransferencia = dataTransferencia;
  }

  
  /**
   * {{{transferencia_detalhe_response_id_conta_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_detalhe_response_id_conta_origem_value}}}")
  public Long getIdContaOrigem() {
    return idContaOrigem;
  }
  public void setIdContaOrigem(Long idContaOrigem) {
    this.idContaOrigem = idContaOrigem;
  }

  
  /**
   * {{{transferencia_detalhe_response_nome_pessoa_origem_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_detalhe_response_nome_pessoa_origem_value}}}")
  public String getNomePessoaOrigem() {
    return nomePessoaOrigem;
  }
  public void setNomePessoaOrigem(String nomePessoaOrigem) {
    this.nomePessoaOrigem = nomePessoaOrigem;
  }

  
  /**
   * {{{transferencia_detalhe_response_id_conta_destino_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_detalhe_response_id_conta_destino_value}}}")
  public Long getIdContaDestino() {
    return idContaDestino;
  }
  public void setIdContaDestino(Long idContaDestino) {
    this.idContaDestino = idContaDestino;
  }

  
  /**
   * {{{transferencia_detalhe_response_nome_pessoa_destino_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_detalhe_response_nome_pessoa_destino_value}}}")
  public String getNomePessoaDestino() {
    return nomePessoaDestino;
  }
  public void setNomePessoaDestino(String nomePessoaDestino) {
    this.nomePessoaDestino = nomePessoaDestino;
  }

  
  /**
   * {{{transferencia_detalhe_response_valor_transferencia_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_detalhe_response_valor_transferencia_value}}}")
  public BigDecimal getValorTransferencia() {
    return valorTransferencia;
  }
  public void setValorTransferencia(BigDecimal valorTransferencia) {
    this.valorTransferencia = valorTransferencia;
  }

  
  /**
   * {{{transferencia_detalhe_response_valor_tarifa_value}}}
   **/
  @ApiModelProperty(value = "{{{transferencia_detalhe_response_valor_tarifa_value}}}")
  public BigDecimal getValorTarifa() {
    return valorTarifa;
  }
  public void setValorTarifa(BigDecimal valorTarifa) {
    this.valorTarifa = valorTarifa;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferenciaDetalheResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  dataTransferencia: ").append(dataTransferencia).append("\n");
    sb.append("  idContaOrigem: ").append(idContaOrigem).append("\n");
    sb.append("  nomePessoaOrigem: ").append(nomePessoaOrigem).append("\n");
    sb.append("  idContaDestino: ").append(idContaDestino).append("\n");
    sb.append("  nomePessoaDestino: ").append(nomePessoaDestino).append("\n");
    sb.append("  valorTransferencia: ").append(valorTransferencia).append("\n");
    sb.append("  valorTarifa: ").append(valorTarifa).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


