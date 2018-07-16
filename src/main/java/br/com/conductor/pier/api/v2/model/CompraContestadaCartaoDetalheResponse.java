package br.com.conductor.pier.api.v2.model;

import java.util.Date;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{compra_contestada_cartao_detalhe_response_description}}}
 **/
@ApiModel(description = "{{{compra_contestada_cartao_detalhe_response_description}}}")
public class CompraContestadaCartaoDetalheResponse  {
  
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("portador")
  private String portador = null;
  @SerializedName("nomePlastico")
  private String nomePlastico = null;
  @SerializedName("dataValidade")
  private Date dataValidade = null;
  @SerializedName("statusCartao")
  private String statusCartao = null;
  @SerializedName("statusCartaoDescricao")
  private String statusCartaoDescricao = null;

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_numero_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_detalhe_response_numero_cartao_value}}}")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_portador_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_detalhe_response_portador_value}}}")
  public String getPortador() {
    return portador;
  }
  public void setPortador(String portador) {
    this.portador = portador;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_nome_plastico_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_detalhe_response_nome_plastico_value}}}")
  public String getNomePlastico() {
    return nomePlastico;
  }
  public void setNomePlastico(String nomePlastico) {
    this.nomePlastico = nomePlastico;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_data_validade_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_detalhe_response_data_validade_value}}}")
  public Date getDataValidade() {
    return dataValidade;
  }
  public void setDataValidade(Date dataValidade) {
    this.dataValidade = dataValidade;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_status_cartao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_detalhe_response_status_cartao_value}}}")
  public String getStatusCartao() {
    return statusCartao;
  }
  public void setStatusCartao(String statusCartao) {
    this.statusCartao = statusCartao;
  }

  
  /**
   * {{{compra_contestada_cartao_detalhe_response_status_cartao_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{compra_contestada_cartao_detalhe_response_status_cartao_descricao_value}}}")
  public String getStatusCartaoDescricao() {
    return statusCartaoDescricao;
  }
  public void setStatusCartaoDescricao(String statusCartaoDescricao) {
    this.statusCartaoDescricao = statusCartaoDescricao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraContestadaCartaoDetalheResponse {\n");
    
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  portador: ").append(portador).append("\n");
    sb.append("  nomePlastico: ").append(nomePlastico).append("\n");
    sb.append("  dataValidade: ").append(dataValidade).append("\n");
    sb.append("  statusCartao: ").append(statusCartao).append("\n");
    sb.append("  statusCartaoDescricao: ").append(statusCartaoDescricao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


