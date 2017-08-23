package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto que representa a atribui\u00C3\u00A7\u00C3\u00A3o da assinatura do cliente
 **/
@ApiModel(description = "Objeto que representa a atribui\u00C3\u00A7\u00C3\u00A3o da assinatura do cliente")
public class AtribuirAssinaturaClientePersist  {
  
  @SerializedName("idArquivo")
  private Long idArquivo = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Arquivo
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Arquivo")
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


