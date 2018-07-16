package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{plataforma_mobile_update_description}}}
 **/
@ApiModel(description = "{{{plataforma_mobile_update_description}}}")
public class PlataformaMobileUpdateValue  {
  
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * {{{plataforma_mobile_update_nome_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{plataforma_mobile_update_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlataformaMobileUpdateValue {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


