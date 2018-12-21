package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object that represents the attribution of the client signature
 **/
@ApiModel(description = "Object that represents the attribution of the client signature")
public class AtribuirAssinaturaClientePersist  {
  
  @SerializedName("idArquivo")
  private Long idArquivo = null;

  
  /**
   * Identification Code of the File
   **/
  @ApiModelProperty(value = "Identification Code of the File")
  public Long getIdArquivo() {
    return idArquivo;
  }
  public void setIdArquivo(Long idArquivo) {
    this.idArquivo = idArquivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtribuirAssinaturaClientePersist {\n");
    
    sb.append("  idArquivo: ").append(idArquivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
