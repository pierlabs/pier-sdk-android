package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Banco
 **/
@ApiModel(description = "Objeto Banco")
public class BancoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("digitoBanco")
  private String digitoBanco = null;

  
  /**
   * C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Banco (id).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Banco (id).")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Nome do banco
   **/
  @ApiModelProperty(value = "Nome do banco")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Descri\u00C3\u00A7\u00C3\u00A3o do banco
   **/
  @ApiModelProperty(value = "Descri\u00C3\u00A7\u00C3\u00A3o do banco")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Digito do banco
   **/
  @ApiModelProperty(value = "Digito do banco")
  public String getDigitoBanco() {
    return digitoBanco;
  }
  public void setDigitoBanco(String digitoBanco) {
    this.digitoBanco = digitoBanco;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BancoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  digitoBanco: ").append(digitoBanco).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
