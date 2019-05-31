package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ControleSubcontaPersist
 **/
@ApiModel(description = "ControleSubcontaPersist")
public class ControleSubcontaPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("finalidade")
  private String finalidade = null;
  @SerializedName("autoGerenciavel")
  private Boolean autoGerenciavel = null;

  
  /**
   * Nome/apelido dado para a subconta
   **/
  @ApiModelProperty(value = "Nome/apelido dado para a subconta")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Finalidade da cria\u00E7\u00E3o da subconta
   **/
  @ApiModelProperty(value = "Finalidade da cria\u00E7\u00E3o da subconta")
  public String getFinalidade() {
    return finalidade;
  }
  public void setFinalidade(String finalidade) {
    this.finalidade = finalidade;
  }

  
  /**
   * Indica se a subconta \u00E9 auto gerenci\u00E1vel ou se apenas a conta pai poder\u00E1 gerir
   **/
  @ApiModelProperty(value = "Indica se a subconta \u00E9 auto gerenci\u00E1vel ou se apenas a conta pai poder\u00E1 gerir")
  public Boolean getAutoGerenciavel() {
    return autoGerenciavel;
  }
  public void setAutoGerenciavel(Boolean autoGerenciavel) {
    this.autoGerenciavel = autoGerenciavel;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ControleSubcontaPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  finalidade: ").append(finalidade).append("\n");
    sb.append("  autoGerenciavel: ").append(autoGerenciavel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
