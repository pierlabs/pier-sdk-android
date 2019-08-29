package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Request parameters related to mifare technology
 **/
@ApiModel(description = "Request parameters related to mifare technology")
public class CartaoMifareRequest  {
  
  @SerializedName("idMifare")
  private Long idMifare = null;
  @SerializedName("matriculaMifare")
  private String matriculaMifare = null;

  
  /**
   * C\u00F3digo identificador da tecnologia MIFARE
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da tecnologia MIFARE")
  public Long getIdMifare() {
    return idMifare;
  }
  public void setIdMifare(Long idMifare) {
    this.idMifare = idMifare;
  }

  
  /**
   * N\u00FAmero da matricula do portador
   **/
  @ApiModelProperty(value = "N\u00FAmero da matricula do portador")
  public String getMatriculaMifare() {
    return matriculaMifare;
  }
  public void setMatriculaMifare(String matriculaMifare) {
    this.matriculaMifare = matriculaMifare;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoMifareRequest {\n");
    
    sb.append("  idMifare: ").append(idMifare).append("\n");
    sb.append("  matriculaMifare: ").append(matriculaMifare).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
