package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{grupo_origem_comercial_response_description}}}
 **/
@ApiModel(description = "{{{grupo_origem_comercial_response_description}}}")
public class GrupoOrigemComercialResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;

  
  /**
   * {{{grupo_origem_comercial_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_origem_comercial_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{grupo_origem_comercial_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{grupo_origem_comercial_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GrupoOrigemComercialResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


