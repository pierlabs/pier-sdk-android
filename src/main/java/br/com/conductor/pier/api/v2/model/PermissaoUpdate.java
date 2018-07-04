package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{permissao_update_object_description}}}
 **/
@ApiModel(description = "{{{permissao_update_object_description}}}")
public class PermissaoUpdate  {
  
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * {{{permissao_update_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{permissao_update_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissaoUpdate {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


