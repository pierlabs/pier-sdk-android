package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da requisi\u00E7\u00E3o da descriptografia de conteudo
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da requisi\u00E7\u00E3o da descriptografia de conteudo")
public class ChaveCriptografiaRequest  {
  
  @SerializedName("idChave")
  private Long idChave = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * Identificador da chave de descriptografia
   **/
  @ApiModelProperty(required = true, value = "Identificador da chave de descriptografia")
  public Long getIdChave() {
    return idChave;
  }
  public void setIdChave(Long idChave) {
    this.idChave = idChave;
  }

  
  /**
   * Conteudo a ser descriptografado
   **/
  @ApiModelProperty(required = true, value = "Conteudo a ser descriptografado")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChaveCriptografiaRequest {\n");
    
    sb.append("  idChave: ").append(idChave).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
