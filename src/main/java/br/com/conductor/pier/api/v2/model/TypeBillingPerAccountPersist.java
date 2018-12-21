package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * TypeBillingPerAccountPersist
 **/
@ApiModel(description = "TypeBillingPerAccountPersist")
public class TypeBillingPerAccountPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoFaturamento")
  private Long idTipoFaturamento = null;

  
  /**
   * Identification Code of the related account
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the related account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Identification Code of the billing type related
   **/
  @ApiModelProperty(required = true, value = "Identification Code of the billing type related")
  public Long getIdTipoFaturamento() {
    return idTipoFaturamento;
  }
  public void setIdTipoFaturamento(Long idTipoFaturamento) {
    this.idTipoFaturamento = idTipoFaturamento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TypeBillingPerAccountPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoFaturamento: ").append(idTipoFaturamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
