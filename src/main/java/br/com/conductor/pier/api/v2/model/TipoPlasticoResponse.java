package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class TipoPlasticoResponse  {
  
  @SerializedName("bandeirado")
  private Boolean bandeirado = null;
  @SerializedName("fabrica")
  private String fabrica = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idEntidade")
  private Long idEntidade = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("nomeArquivo")
  private String nomeArquivo = null;
  @SerializedName("tamanhoLinhas")
  private String tamanhoLinhas = null;
  @SerializedName("valorEmissao")
  private BigDecimal valorEmissao = null;

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getBandeirado() {
    return bandeirado;
  }
  public void setBandeirado(Boolean bandeirado) {
    this.bandeirado = bandeirado;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getFabrica() {
    return fabrica;
  }
  public void setFabrica(String fabrica) {
    this.fabrica = fabrica;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Long getIdEntidade() {
    return idEntidade;
  }
  public void setIdEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getNomeArquivo() {
    return nomeArquivo;
  }
  public void setNomeArquivo(String nomeArquivo) {
    this.nomeArquivo = nomeArquivo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getTamanhoLinhas() {
    return tamanhoLinhas;
  }
  public void setTamanhoLinhas(String tamanhoLinhas) {
    this.tamanhoLinhas = tamanhoLinhas;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getValorEmissao() {
    return valorEmissao;
  }
  public void setValorEmissao(BigDecimal valorEmissao) {
    this.valorEmissao = valorEmissao;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TipoPlasticoResponse {\n");
    
    sb.append("  bandeirado: ").append(bandeirado).append("\n");
    sb.append("  fabrica: ").append(fabrica).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idEntidade: ").append(idEntidade).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  nomeArquivo: ").append(nomeArquivo).append("\n");
    sb.append("  tamanhoLinhas: ").append(tamanhoLinhas).append("\n");
    sb.append("  valorEmissao: ").append(valorEmissao).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
