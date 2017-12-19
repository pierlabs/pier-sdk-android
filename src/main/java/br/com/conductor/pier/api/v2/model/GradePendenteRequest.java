package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class GradePendenteRequest  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("dataBase")
  private String dataBase = null;

  
  /**
   * C\u00C3\u00B3digo identificador da conta.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da conta.")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Data do ajuste no formato yyyy-MM-dd.
   **/
  @ApiModelProperty(value = "Data do ajuste no formato yyyy-MM-dd.")
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


