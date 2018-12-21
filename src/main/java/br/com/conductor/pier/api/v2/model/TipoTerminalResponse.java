package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{tipo_terminal_response_description}}}
 **/
@ApiModel(description = "{{{tipo_terminal_response_description}}}")
public class TipoTerminalResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricaoTerminal")
  private String descricaoTerminal = null;

  
  /**
   * {{{tipo_terminal_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_terminal_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{tipo_terminal_response_descricao_terminal_value}}}
   **/
  @ApiModelProperty(value = "{{{tipo_terminal_response_descricao_terminal_value}}}")
  public String getDescricaoTerminal() {
    return descricaoTerminal;
  }
  public void setDescricaoTerminal(String descricaoTerminal) {
    this.descricaoTerminal = descricaoTerminal;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTerminalResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  descricaoTerminal: ").append(descricaoTerminal).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
