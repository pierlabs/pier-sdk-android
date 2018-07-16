package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{grade_pendente_request_description}}}
 **/
@ApiModel(description = "{{{grade_pendente_request_description}}}")
public class GradePendenteRequest  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("dataBase")
  private String dataBase = null;

  
  /**
   * {{{grade_pendente_request_id_conta_value}}}
   **/
  @ApiModelProperty(value = "{{{grade_pendente_request_id_conta_value}}}")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * {{{grade_pendente_request_data_base_value}}}
   **/
  @ApiModelProperty(value = "{{{grade_pendente_request_data_base_value}}}")
  public String getDataBase() {
    return dataBase;
  }
  public void setDataBase(String dataBase) {
    this.dataBase = dataBase;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GradePendenteRequest {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  dataBase: ").append(dataBase).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


