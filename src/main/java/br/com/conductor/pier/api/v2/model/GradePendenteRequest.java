package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation Object Request for grid pending
 **/
@ApiModel(description = "Representation Object Request for grid pending")
public class GradePendenteRequest  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("dataBase")
  private String dataBase = null;

  
  /**
   * Identifier Code of the Account
   **/
  @ApiModelProperty(value = "Identifier Code of the Account")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Date of adjustment in the format yyyy-MM-dd
   **/
  @ApiModelProperty(value = "Date of adjustment in the format yyyy-MM-dd")
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
