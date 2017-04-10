package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Objeto DetalheOportunidade
 **/
@ApiModel(description = "Objeto DetalheOportunidade")
public class DetalheOportunidadeUpdate  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nomeCampo")
  private String nomeCampo = null;
  @SerializedName("conteudo")
  private String conteudo = null;

  
  /**
   * C\u00C3\u00B3digo identificador do detalhe
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo identificador do detalhe")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do conte\u00C3\u00BAdo
   **/
  @ApiModelProperty(value = "Nome do conte\u00C3\u00BAdo")
  public String getNomeCampo() {
    return nomeCampo;
  }
  public void setNomeCampo(String nomeCampo) {
    this.nomeCampo = nomeCampo;
  }

  
  /**
   * Conte\u00C3\u00BAdo do detalhe
   **/
  @ApiModelProperty(value = "Conte\u00C3\u00BAdo do detalhe")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalheOportunidadeUpdate {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nomeCampo: ").append(nomeCampo).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


