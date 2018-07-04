package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.ArquivoParametroResponse;
import java.util.*;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;



/**
 * {{{arquivo_response_description}}}
 **/
@ApiModel(description = "{{{arquivo_response_description}}}")
public class ArquivoResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoArquivo")
  private Long idTipoArquivo = null;
  @SerializedName("nomeTipoArquivo")
  private String nomeTipoArquivo = null;
  @SerializedName("idStatusArquivo")
  private Long idStatusArquivo = null;
  @SerializedName("nomeStatusArquivo")
  private String nomeStatusArquivo = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("extensao")
  private String extensao = null;
  @SerializedName("dataInclusao")
  private String dataInclusao = null;
  @SerializedName("dataAlteracao")
  private String dataAlteracao = null;
  @SerializedName("detalhes")
  private List<ArquivoParametroResponse> detalhes = null;

  
  /**
   * {{{arquivo_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{arquivo_response_id_tipo_arquivo_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_id_tipo_arquivo_value}}}")
  public Long getIdTipoArquivo() {
    return idTipoArquivo;
  }
  public void setIdTipoArquivo(Long idTipoArquivo) {
    this.idTipoArquivo = idTipoArquivo;
  }

  
  /**
   * {{{arquivo_response_nome_tipo_arquivo_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_nome_tipo_arquivo_value}}}")
  public String getNomeTipoArquivo() {
    return nomeTipoArquivo;
  }
  public void setNomeTipoArquivo(String nomeTipoArquivo) {
    this.nomeTipoArquivo = nomeTipoArquivo;
  }

  
  /**
   * {{{arquivo_response_id_status_arquivo_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_id_status_arquivo_value}}}")
  public Long getIdStatusArquivo() {
    return idStatusArquivo;
  }
  public void setIdStatusArquivo(Long idStatusArquivo) {
    this.idStatusArquivo = idStatusArquivo;
  }

  
  /**
   * {{{arquivo_response_nome_status_arquivo_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_nome_status_arquivo_value}}}")
  public String getNomeStatusArquivo() {
    return nomeStatusArquivo;
  }
  public void setNomeStatusArquivo(String nomeStatusArquivo) {
    this.nomeStatusArquivo = nomeStatusArquivo;
  }

  
  /**
   * {{{arquivo_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{arquivo_response_extensao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_extensao_value}}}")
  public String getExtensao() {
    return extensao;
  }
  public void setExtensao(String extensao) {
    this.extensao = extensao;
  }

  
  /**
   * {{{arquivo_response_data_inclusao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_data_inclusao_value}}}")
  public String getDataInclusao() {
    return dataInclusao;
  }
  public void setDataInclusao(String dataInclusao) {
    this.dataInclusao = dataInclusao;
  }

  
  /**
   * {{{arquivo_response_data_alteracao_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_data_alteracao_value}}}")
  public String getDataAlteracao() {
    return dataAlteracao;
  }
  public void setDataAlteracao(String dataAlteracao) {
    this.dataAlteracao = dataAlteracao;
  }

  
  /**
   * {{{arquivo_response_detalhes_value}}}
   **/
  @ApiModelProperty(value = "{{{arquivo_response_detalhes_value}}}")
  public List<ArquivoParametroResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<ArquivoParametroResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArquivoResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoArquivo: ").append(idTipoArquivo).append("\n");
    sb.append("  nomeTipoArquivo: ").append(nomeTipoArquivo).append("\n");
    sb.append("  idStatusArquivo: ").append(idStatusArquivo).append("\n");
    sb.append("  nomeStatusArquivo: ").append(nomeStatusArquivo).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  extensao: ").append(extensao).append("\n");
    sb.append("  dataInclusao: ").append(dataInclusao).append("\n");
    sb.append("  dataAlteracao: ").append(dataAlteracao).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}


