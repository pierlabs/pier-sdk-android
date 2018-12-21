package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object to change accounts. None of the fields are required. Only the fields you want to change must be entered
 **/
@ApiModel(description = "Object to change accounts. None of the fields are required. Only the fields you want to change must be entered")
public class ContaPartialUpdate  {
  
  @SerializedName("funcaoAtiva")
  private String funcaoAtiva = null;
  @SerializedName("idContaEmissor")
  private Long idContaEmissor = null;

  
  /**
   * Active account function. Represents the function in which the account is enabled. Property should only be reported if the issuer makes use of account functions. The functions available for the accounts can be viewed in api/contas/tipos-funcoes
   **/
  @ApiModelProperty(value = "Active account function. Represents the function in which the account is enabled. Property should only be reported if the issuer makes use of account functions. The functions available for the accounts can be viewed in api/contas/tipos-funcoes")
  public String getFuncaoAtiva() {
    return funcaoAtiva;
  }
  public void setFuncaoAtiva(String funcaoAtiva) {
    this.funcaoAtiva = funcaoAtiva;
  }

  
  /**
   * Identifier of the internal control account created by the issuer
   **/
  @ApiModelProperty(value = "Identifier of the internal control account created by the issuer")
  public Long getIdContaEmissor() {
    return idContaEmissor;
  }
  public void setIdContaEmissor(Long idContaEmissor) {
    this.idContaEmissor = idContaEmissor;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContaPartialUpdate {\n");
    
    sb.append("  funcaoAtiva: ").append(funcaoAtiva).append("\n");
    sb.append("  idContaEmissor: ").append(idContaEmissor).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
