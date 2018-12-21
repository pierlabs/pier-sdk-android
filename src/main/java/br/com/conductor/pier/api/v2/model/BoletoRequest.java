package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{boleto_request_description}}}
 **/
@ApiModel(description = "{{{boleto_request_description}}}")
public class BoletoRequest  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("tipoBoleto")
  private Long tipoBoleto = null;
  @SerializedName("valor")
  private BigDecimal valor = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("idConvenio")
  private Long idConvenio = null;

  
  /**
   * {{{boleto_request_id_conta_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{boleto_request_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{boleto_request_tipo_boleto_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{boleto_request_tipo_boleto_value}}}")
  public Long getTipoBoleto() {
    return tipoBoleto;
  }
  public void setTipoBoleto(Long tipoBoleto) {
    this.tipoBoleto = tipoBoleto;
  }

  
  /**
   * {{{boleto_request_valor_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{boleto_request_valor_value}}}")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * {{{boleto_request_data_vencimento_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{boleto_request_data_vencimento_value}}}")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{boleto_request_id_convenio_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_request_id_convenio_value}}}")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoRequest {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  tipoBoleto: ").append(tipoBoleto).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  idConvenio: ").append(idConvenio).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
