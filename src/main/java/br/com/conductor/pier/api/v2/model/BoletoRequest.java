package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Par\u00E2metros de requisi\u00E7\u00E3o de um Boleto
 **/
@ApiModel(description = "Par\u00E2metros de requisi\u00E7\u00E3o de um Boleto")
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
  @SerializedName("idPessoafontePagadora")
  private Long idPessoafontePagadora = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da Conta (ID)
   **/
  @ApiModelProperty(required = true, value = "C\u00F3digo de identifica\u00E7\u00E3o da Conta (ID)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Tipo de Boleto a ser gerado
   **/
  @ApiModelProperty(required = true, value = "Tipo de Boleto a ser gerado")
  public Long getTipoBoleto() {
    return tipoBoleto;
  }
  public void setTipoBoleto(Long tipoBoleto) {
    this.tipoBoleto = tipoBoleto;
  }

  
  /**
   * Valor da cobran\u00E7a gerada
   **/
  @ApiModelProperty(required = true, value = "Valor da cobran\u00E7a gerada")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  
  /**
   * Data de vencimento da cobran\u00E7a
   **/
  @ApiModelProperty(required = true, value = "Data de vencimento da cobran\u00E7a")
  public String getDataVencimento() {
    return dataVencimento;
  }
  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio para onde o boleto deve ser gerado
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do conv\u00EAnio para onde o boleto deve ser gerado")
  public Long getIdConvenio() {
    return idConvenio;
  }
  public void setIdConvenio(Long idConvenio) {
    this.idConvenio = idConvenio;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da pessoa que ser\u00E1 a fonte pagadora do boleto
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da pessoa que ser\u00E1 a fonte pagadora do boleto")
  public Long getIdPessoafontePagadora() {
    return idPessoafontePagadora;
  }
  public void setIdPessoafontePagadora(Long idPessoafontePagadora) {
    this.idPessoafontePagadora = idPessoafontePagadora;
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
    sb.append("  idPessoafontePagadora: ").append(idPessoafontePagadora).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
