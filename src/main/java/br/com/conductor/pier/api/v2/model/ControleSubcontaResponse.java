package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o de resposta do recurso de controle de subconta
 **/
@ApiModel(description = "Representa\u00E7\u00E3o de resposta do recurso de controle de subconta")
public class ControleSubcontaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idVinculoConta")
  private Long idVinculoConta = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("finalidade")
  private String finalidade = null;
  @SerializedName("autoGerenciavel")
  private Boolean autoGerenciavel = null;

  
  /**
   * C\u00F3digo identificador do controle da subconta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do controle da subconta (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Id referenciando o v\u00EDnculo da subconta na tabela VinculosContas
   **/
  @ApiModelProperty(value = "Id referenciando o v\u00EDnculo da subconta na tabela VinculosContas")
  public Long getIdVinculoConta() {
    return idVinculoConta;
  }
  public void setIdVinculoConta(Long idVinculoConta) {
    this.idVinculoConta = idVinculoConta;
  }

  
  /**
   * C\u00F3digo identificador da subconta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da subconta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
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
    sb.append("class ControleSubcontaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idVinculoConta: ").append(idVinculoConta).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  finalidade: ").append(finalidade).append("\n");
    sb.append("  autoGerenciavel: ").append(autoGerenciavel).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
