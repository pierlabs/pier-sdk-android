package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representation of the content decryption request
 **/
@ApiModel(description = "Representation of the content decryption request")
public class ChaveCriptografiaRequest  {
  
  @SerializedName("idChave")
  private Long idChave = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * Decryption key identifier
   **/
  @ApiModelProperty(required = true, value = "Decryption key identifier")
  public Long getIdChave() {
    return idChave;
  }
  public void setIdChave(Long idChave) {
    this.idChave = idChave;
  }

  
  /**
   * Content to be decrypted
   **/
  @ApiModelProperty(required = true, value = "Content to be decrypted")
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
