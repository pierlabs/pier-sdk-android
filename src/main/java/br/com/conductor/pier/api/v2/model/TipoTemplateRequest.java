package br.com.conductor.pier.api.v2.model;



import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * Representa\u00C3\u00A7\u00C3\u00A3o do tipo de template.
 **/
@ApiModel(description = "Representa\u00C3\u00A7\u00C3\u00A3o do tipo de template.")
public class TipoTemplateRequest  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("sigla")
  private String sigla = null;

  
  /**
   * Nome do tipo de template.
   **/
  @ApiModelProperty(value = "Nome do tipo de template.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do tipo de template.
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do tipo de template.")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Sigla do tipo de template.
   **/
  @ApiModelProperty(value = "Sigla do tipo de template.")
  public String getSigla() {
    return sigla;
  }
  public void setSigla(String sigla) {
    this.sigla = sigla;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoTemplateRequest {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  sigla: ").append(sigla).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


