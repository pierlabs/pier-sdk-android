package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class AjusteResponse  {
  
  @SerializedName("idAjuste")
  private Long idAjuste = null;
  @SerializedName("idTipoAjuste")
  private Long idTipoAjuste = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("dataAjuste")
  private String dataAjuste = null;
  @SerializedName("valor")
  private BigDecimal valor = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do ajuste (id)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do ajuste (id)")
  public Long getIdAjuste() {
    return idAjuste;
  }
  public void setIdAjuste(Long idAjuste) {
    this.idAjuste = idAjuste;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do ajuste
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do tipo do ajuste")
  public Long getIdTipoAjuste() {
    return idTipoAjuste;
  }
  public void setIdTipoAjuste(Long idTipoAjuste) {
    this.idTipoAjuste = idTipoAjuste;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (idConta)
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da conta (idConta)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data do ajuste
   **/
  @ApiModelProperty(value = "Data do ajuste")
  public String getDataAjuste() {
    return dataAjuste;
  }
  public void setDataAjuste(String dataAjuste) {
    this.dataAjuste = dataAjuste;
  }

  
  /**
   * Valor do ajuste
   **/
  @ApiModelProperty(value = "Valor do ajuste")
  public BigDecimal getValor() {
    return valor;
  }
  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AjusteResponse {\n");
    
    sb.append("  idAjuste: ").append(idAjuste).append("\n");
    sb.append("  idTipoAjuste: ").append(idTipoAjuste).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  dataAjuste: ").append(dataAjuste).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


