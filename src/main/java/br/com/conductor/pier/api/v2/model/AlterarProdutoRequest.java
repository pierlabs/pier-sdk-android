package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do  recurso Dispositivo
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o da requisi\u00C3\u00A7\u00C3\u00A3o do  recurso Dispositivo")
public class AlterarProdutoRequest  {
  
  @SerializedName("idProduto")
  private Long idProduto = null;
  @SerializedName("idOrigemComercial")
  private Long idOrigemComercial = null;
  @SerializedName("limiteGlobal")
  private BigDecimal limiteGlobal = null;

  
  /**
   * C\u00C3\u00B3digo identificador do produto.
   **/
  @ApiModelProperty(required = true, value = "C\u00C3\u00B3digo identificador do produto.")
  public Long getIdProduto() {
    return idProduto;
  }
  public void setIdProduto(Long idProduto) {
    this.idProduto = idProduto;
  }

  
  /**
   * C\u00C3\u00B3digo identificador da origem comercial.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador da origem comercial.")
  public Long getIdOrigemComercial() {
    return idOrigemComercial;
  }
  public void setIdOrigemComercial(Long idOrigemComercial) {
    this.idOrigemComercial = idOrigemComercial;
  }

  
  /**
   * Valor do novo limite Global.
   **/
  @ApiModelProperty(value = "Valor do novo limite Global.")
  public BigDecimal getLimiteGlobal() {
    return limiteGlobal;
  }
  public void setLimiteGlobal(BigDecimal limiteGlobal) {
    this.limiteGlobal = limiteGlobal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlterarProdutoRequest {\n");
    
    sb.append("  idProduto: ").append(idProduto).append("\n");
    sb.append("  idOrigemComercial: ").append(idOrigemComercial).append("\n");
    sb.append("  limiteGlobal: ").append(limiteGlobal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


