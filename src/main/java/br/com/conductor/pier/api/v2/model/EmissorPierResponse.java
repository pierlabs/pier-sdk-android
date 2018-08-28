package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{emissor_response_description}}}
 **/
@ApiModel(description = "{{{emissor_response_description}}}")
public class EmissorPierResponse  {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("tema")
  private String tema = null;

  
  /**
   * {{{emissor_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{emissor_response_id_value}}}")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * {{{emissor_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{emissor_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{emissor_response_tema_value}}}
   **/
  @ApiModelProperty(value = "{{{emissor_response_tema_value}}}")
  public String getTema() {
    return tema;
  }
  public void setTema(String tema) {
    this.tema = tema;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmissorPierResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  tema: ").append(tema).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
