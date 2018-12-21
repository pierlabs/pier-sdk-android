package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request representation of save establishment
 **/
@ApiModel(description = "Request representation of save establishment")
public class ConsultaCadastroEstabelecimentoDTO  {
  
  @SerializedName("dataHoraConsulta")
  private String dataHoraConsulta = null;
  public enum StatusEnum {
     OK,  NOK, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  public enum TipoEntidadeEnum {
     ATIVO,  BLOQUEADO, 
  };
  @SerializedName("tipoEntidade")
  private TipoEntidadeEnum tipoEntidade = null;

  
  /**
   * Date time of the register
   **/
  @ApiModelProperty(value = "Date time of the register")
  public String getDataHoraConsulta() {
    return dataHoraConsulta;
  }
  public void setDataHoraConsulta(String dataHoraConsulta) {
    this.dataHoraConsulta = dataHoraConsulta;
  }

  
  /**
   * Retrieving status (1 - OK, 2 - NOK)
   **/
  @ApiModelProperty(value = "Retrieving status (1 - OK, 2 - NOK)")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Type of the entity (1 - ACTIVE, 2 - LOCKED)
   **/
  @ApiModelProperty(value = "Type of the entity (1 - ACTIVE, 2 - LOCKED)")
  public TipoEntidadeEnum getTipoEntidade() {
    return tipoEntidade;
  }
  public void setTipoEntidade(TipoEntidadeEnum tipoEntidade) {
    this.tipoEntidade = tipoEntidade;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaCadastroEstabelecimentoDTO {\n");
    
    sb.append("  dataHoraConsulta: ").append(dataHoraConsulta).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  tipoEntidade: ").append(tipoEntidade).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
