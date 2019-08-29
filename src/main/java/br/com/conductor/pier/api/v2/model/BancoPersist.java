package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto banco a ser persistido
 **/
@ApiModel(description = "Objeto banco a ser persistido")
public class BancoPersist  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("digitoBanco")
  private String digitoBanco = null;
  @SerializedName("codigoBanco")
  private Long codigoBanco = null;
  @SerializedName("ispb")
  private String ispb = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("flagAtivoBacen")
  private Boolean flagAtivoBacen = null;

  
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
   * Descri\u00E7\u00E3o do banco
   **/
  @ApiModelProperty(value = "Descri\u00E7\u00E3o do banco")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * D\u00EDgito identificador do banco
   **/
  @ApiModelProperty(value = "D\u00EDgito identificador do banco")
  public String getDigitoBanco() {
    return digitoBanco;
  }
  public void setDigitoBanco(String digitoBanco) {
    this.digitoBanco = digitoBanco;
  }

  
  /**
   * Codigo identificador do banco
   **/
  @ApiModelProperty(value = "Codigo identificador do banco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * Numero ispb do banco
   **/
  @ApiModelProperty(value = "Numero ispb do banco")
  public String getIspb() {
    return ispb;
  }
  public void setIspb(String ispb) {
    this.ispb = ispb;
  }

  
  /**
   * N\u00FAmero do CNPJ do banco
   **/
  @ApiModelProperty(value = "N\u00FAmero do CNPJ do banco")
  public String getCnpj() {
    return cnpj;
  }
  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  
  /**
   * Indica se o banco est\u00E1 ativo no BACEN
   **/
  @ApiModelProperty(value = "Indica se o banco est\u00E1 ativo no BACEN")
  public Boolean getFlagAtivoBacen() {
    return flagAtivoBacen;
  }
  public void setFlagAtivoBacen(Boolean flagAtivoBacen) {
    this.flagAtivoBacen = flagAtivoBacen;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BancoPersist {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  digitoBanco: ").append(digitoBanco).append("\n");
    sb.append("  codigoBanco: ").append(codigoBanco).append("\n");
    sb.append("  ispb: ").append(ispb).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  flagAtivoBacen: ").append(flagAtivoBacen).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
