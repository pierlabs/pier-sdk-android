package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * ObjecttypeTerminal
 **/
@ApiModel(description = "ObjecttypeTerminal")
public class TipoTerminalResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("descricaoTerminal")
  private String descricaoTerminal = null;

  
  /**
   * Identification Code of the Terminal Type (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Terminal Type (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Description of the Terminal Type
   **/
  @ApiModelProperty(value = "Description of the Terminal Type")
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
