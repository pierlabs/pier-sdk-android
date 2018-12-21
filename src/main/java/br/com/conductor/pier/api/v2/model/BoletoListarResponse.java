package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{boleto_listar_response_description}}}
 **/
@ApiModel(description = "{{{boleto_listar_response_description}}}")
public class BoletoListarResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("nossoNumero")
  private String nossoNumero = null;
  @SerializedName("dataVencimento")
  private String dataVencimento = null;
  @SerializedName("valorBoleto")
  private BigDecimal valorBoleto = null;
  @SerializedName("idTipoBoleto")
  private Long idTipoBoleto = null;

  
  /**
   * {{{boleto_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{boleto_response_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{boleto_response_nosso_numero_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_nosso_numero_value}}}")
  public String getNossoNumero() {
    return nossoNumero;
  }
  public void setNossoNumero(String nossoNumero) {
    this.nossoNumero = nossoNumero;
  }

  
  /**
   * {{{boleto_response_data_vencimento_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_data_vencimento_value}}}")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * {{{boleto_response_valor_boleto_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_valor_boleto_value}}}")
  public BigDecimal getValorBoleto() {
    return valorBoleto;
  }
  public void setValorBoleto(BigDecimal valorBoleto) {
    this.valorBoleto = valorBoleto;
  }

  
  /**
   * {{{boleto_response_id_tipo_boleto_value}}}
   **/
  @ApiModelProperty(value = "{{{boleto_response_id_tipo_boleto_value}}}")
  public Long getIdTipoBoleto() {
    return idTipoBoleto;
  }
  public void setIdTipoBoleto(Long idTipoBoleto) {
    this.idTipoBoleto = idTipoBoleto;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoletoListarResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nossoNumero: ").append(nossoNumero).append("\n");
    sb.append("  dataVencimento: ").append(dataVencimento).append("\n");
    sb.append("  valorBoleto: ").append(valorBoleto).append("\n");
    sb.append("  idTipoBoleto: ").append(idTipoBoleto).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
