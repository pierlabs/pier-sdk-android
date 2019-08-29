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
  @SerializedName("ispb")
  private String ispb = null;
  @SerializedName("cnpj")
  private String cnpj = null;
  @SerializedName("flagAtivoBacen")
  private Boolean flagAtivoBacen = null;

  
  /**
   * C\u00F3digo de Identifica\u00E7\u00E3o do Banco (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de Identifica\u00E7\u00E3o do Banco (id)")
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
   * Digito do banco
   **/
  @ApiModelProperty(value = "Digito do banco")
  public String getDigitoBanco() {
    return digitoBanco;
  }
  public void setDigitoBanco(String digitoBanco) {
    this.digitoBanco = digitoBanco;
  }

  
  /**
   * C\u00F3digo ispb do banco
   **/
  @ApiModelProperty(value = "C\u00F3digo ispb do banco")
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
    sb.append("class BancoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  digitoBanco: ").append(digitoBanco).append("\n");
    sb.append("  ispb: ").append(ispb).append("\n");
    sb.append("  cnpj: ").append(cnpj).append("\n");
    sb.append("  flagAtivoBacen: ").append(flagAtivoBacen).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
