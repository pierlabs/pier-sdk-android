package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Object Bank
 **/
@ApiModel(description = "Object Bank")
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
   * Identification Code of the Bank (id)
   **/
  @ApiModelProperty(value = "Identification Code of the Bank (id)")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Name of the Bank
   **/
  @ApiModelProperty(value = "Name of the Bank")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Description of the bank
   **/
  @ApiModelProperty(value = "Description of the bank")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * Digit of the bank
   **/
  @ApiModelProperty(value = "Digit of the bank")
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
