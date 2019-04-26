package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de persist\u00EAncia de SMSConta
 **/
@ApiModel(description = "Objeto de persist\u00EAncia de SMSConta")
public class SMSContaPersist  {
  
  @SerializedName("idSMSTipoServico")
  private Long idSMSTipoServico = null;

  
  /**
   * Id do tipo servi\u00E7o SMS (Id_SMSTipoServico)
   **/
  @ApiModelProperty(required = true, value = "Id do tipo servi\u00E7o SMS (Id_SMSTipoServico)")
  public Long getIdSMSTipoServico() {
    return idSMSTipoServico;
  }
  public void setIdSMSTipoServico(Long idSMSTipoServico) {
    this.idSMSTipoServico = idSMSTipoServico;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SMSContaPersist {\n");
    
    sb.append("  idSMSTipoServico: ").append(idSMSTipoServico).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
