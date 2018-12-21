package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ServiceObject object for data persistence
 **/
@ApiModel(description = "ServiceObject object for data persistence")
public class RepresentationOfTheResourceEntryOfRegisteringAServiceAccount  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("idTipoServico")
  private Long idTipoServico = null;

  
  /**
   * Account ID code
   **/
  @ApiModelProperty(value = "Account ID code")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Service Type Identification Code
   **/
  @ApiModelProperty(value = "Service Type Identification Code")
  public Long getIdTipoServico() {
    return idTipoServico;
  }
  public void setIdTipoServico(Long idTipoServico) {
    this.idTipoServico = idTipoServico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepresentationOfTheResourceEntryOfRegisteringAServiceAccount {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  idTipoServico: ").append(idTipoServico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
