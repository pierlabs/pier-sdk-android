package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto ArquivoParametros para persist\u00C3\u00AAncia de dados.
 **/
@ApiModel(description = "Objeto ArquivoParametros para persist\u00C3\u00AAncia de dados.")
public class ArquivoDetalhesPersist  {
  
  @SerializedName("nomeCampo")
  private String nomeCampo = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * Nome que identifica o detalhe do arquivo
   **/
  @ApiModelProperty(required = true, value = "Nome que identifica o detalhe do arquivo")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * Conte\u00C3\u00BAdo do nomeCampo
   **/
  @ApiModelProperty(required = true, value = "Conte\u00C3\u00BAdo do nomeCampo")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoDetalhesPersist {\n");
    
    sb.append("  nomeCampo: ").append(nomeCampo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


