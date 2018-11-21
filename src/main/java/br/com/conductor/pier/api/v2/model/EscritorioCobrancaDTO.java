package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{telefone_escritorio_cobranca_d_t_o_description}}}
 **/
@ApiModel(description = "{{{telefone_escritorio_cobranca_d_t_o_description}}}")
public class EscritorioCobrancaDTO  {
  
  @SerializedName("idCredor")
  private Long idCredor = null;
  @SerializedName("prefixo")
  private String prefixo = null;
  @SerializedName("ativo")
  private Boolean ativo = null;
  @SerializedName("nomeContato")
  private String nomeContato = null;
  @SerializedName("email")
  private String email = null;
  @SerializedName("nomeLogradouro")
  private String nomeLogradouro = null;
  @SerializedName("numeroEndereco")
  private Integer numeroEndereco = null;
  @SerializedName("complementoEndereco")
  private String complementoEndereco = null;
  @SerializedName("bairro")
  private String bairro = null;
  @SerializedName("cidade")
  private String cidade = null;
  @SerializedName("cep")
  private String cep = null;
  @SerializedName("uf")
  private String uf = null;
  @SerializedName("responsavel")
  private String responsavel = null;
  @SerializedName("flagSegundaViaAcordo")
  private Integer flagSegundaViaAcordo = null;
  @SerializedName("valorMinimoParcela")
  private BigDecimal valorMinimoParcela = null;
  @SerializedName("descontoMaximo")
  private BigDecimal descontoMaximo = null;

  
  /**
   * {{{escritorio_cobranca_d_t_o_id_credor_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{escritorio_cobranca_d_t_o_id_credor_value}}}")
  public Long getIdCredor() {
    return idCredor;
  }
  public void setIdCredor(Long idCredor) {
    this.idCredor = idCredor;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_prefixo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{escritorio_cobranca_d_t_o_prefixo_value}}}")
  public String getPrefixo() {
    return prefixo;
  }
  public void setPrefixo(String prefixo) {
    this.prefixo = prefixo;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_ativo_value}}}
   **/
  @ApiModelProperty(required = true, value = "{{{escritorio_cobranca_d_t_o_ativo_value}}}")
  public Boolean getAtivo() {
    return ativo;
  }
  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_nome_contato_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_nome_contato_value}}}")
  public String getNomeContato() {
    return nomeContato;
  }
  public void setNomeContato(String nomeContato) {
    this.nomeContato = nomeContato;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_email_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_email_value}}}")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_nome_logradouro_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_nome_logradouro_value}}}")
  public String getNomeLogradouro() {
    return nomeLogradouro;
  }
  public void setNomeLogradouro(String nomeLogradouro) {
    this.nomeLogradouro = nomeLogradouro;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_numero_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_numero_endereco_value}}}")
  public Integer getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(Integer numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_complemento_endereco_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_complemento_endereco_value}}}")
  public String getComplementoEndereco() {
    return complementoEndereco;
  }
  public void setComplementoEndereco(String complementoEndereco) {
    this.complementoEndereco = complementoEndereco;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_bairro_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_bairro_value}}}")
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_cidade_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_cidade_value}}}")
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_cep_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_cep_value}}}")
  public String getCep() {
    return cep;
  }
  public void setCep(String cep) {
    this.cep = cep;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_uf_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_uf_value}}}")
  public String getUf() {
    return uf;
  }
  public void setUf(String uf) {
    this.uf = uf;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_responsavel_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_responsavel_value}}}")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_flag_segunda_via_acordo_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_flag_segunda_via_acordo_value}}}")
  public Integer getFlagSegundaViaAcordo() {
    return flagSegundaViaAcordo;
  }
  public void setFlagSegundaViaAcordo(Integer flagSegundaViaAcordo) {
    this.flagSegundaViaAcordo = flagSegundaViaAcordo;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_valor_minimo_parcela_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_valor_minimo_parcela_value}}}")
  public BigDecimal getValorMinimoParcela() {
    return valorMinimoParcela;
  }
  public void setValorMinimoParcela(BigDecimal valorMinimoParcela) {
    this.valorMinimoParcela = valorMinimoParcela;
  }

  
  /**
   * {{{escritorio_cobranca_d_t_o_desconto_maximo_value}}}
   **/
  @ApiModelProperty(value = "{{{escritorio_cobranca_d_t_o_desconto_maximo_value}}}")
  public BigDecimal getDescontoMaximo() {
    return descontoMaximo;
  }
  public void setDescontoMaximo(BigDecimal descontoMaximo) {
    this.descontoMaximo = descontoMaximo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscritorioCobrancaDTO {\n");
    
    sb.append("  idCredor: ").append(idCredor).append("\n");
    sb.append("  prefixo: ").append(prefixo).append("\n");
    sb.append("  ativo: ").append(ativo).append("\n");
    sb.append("  nomeContato: ").append(nomeContato).append("\n");
    sb.append("  email: ").append(email).append("\n");
    sb.append("  nomeLogradouro: ").append(nomeLogradouro).append("\n");
    sb.append("  numeroEndereco: ").append(numeroEndereco).append("\n");
    sb.append("  complementoEndereco: ").append(complementoEndereco).append("\n");
    sb.append("  bairro: ").append(bairro).append("\n");
    sb.append("  cidade: ").append(cidade).append("\n");
    sb.append("  cep: ").append(cep).append("\n");
    sb.append("  uf: ").append(uf).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  flagSegundaViaAcordo: ").append(flagSegundaViaAcordo).append("\n");
    sb.append("  valorMinimoParcela: ").append(valorMinimoParcela).append("\n");
    sb.append("  descontoMaximo: ").append(descontoMaximo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
