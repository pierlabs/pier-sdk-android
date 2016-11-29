package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



@ApiModel(description = "")
public class ExtraInfo  {
  
  @SerializedName("idEmissor")
  private Integer idEmissor = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Integer idEmissor) {
    this.idEmissor = idEmissor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtraInfo {\n");
    
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


