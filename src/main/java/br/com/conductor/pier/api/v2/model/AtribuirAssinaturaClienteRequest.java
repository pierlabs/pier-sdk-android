package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto que representa a atribui\u00C3\u00A7\u00C3\u00A3o da assinatura do cliente
 **/
@ApiModel(description = "Objeto que representa a atribui\u00C3\u00A7\u00C3\u00A3o da assinatura do cliente")
public class AtribuirAssinaturaClienteRequest  {
  
  @SerializedName("idImagem")
  private Long idImagem = null;

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da imagem
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o da imagem")
  public Long getIdImagem() {
    return idImagem;
  }
  public void setIdImagem(Long idImagem) {
    this.idImagem = idImagem;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AtribuirAssinaturaClienteRequest {\n");
    
    sb.append("  idImagem: ").append(idImagem).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


