import React, { useCallback, useState } from 'react';
import { useDropzone } from 'react-dropzone';

const ImageUploader = () => {
  const [images, setImages] = useState([]);

  const onDrop = useCallback((acceptedFiles) => {
    const newImages = acceptedFiles.map((file) => Object.assign(file, { preview: URL.createObjectURL(file) }));
    setImages((prevImages) => [...prevImages, ...newImages]);
  }, []);

  const { getRootProps, getInputProps } = useDropzone({
    accept: 'image/*',
    onDrop,
    multiple: true,
  });

  return (
    <div>
      <div {...getRootProps()} style={dropzoneStyles}>
        <input {...getInputProps()} />
        <p>Drag & drop images here, or click to select images</p>
      </div>
      <div style={previewContainerStyles}>
        {images.map((file) => (
          <img key={file.name} src={file.preview} alt={file.name} style={imageStyles} />
        ))}
      </div>
    </div>
  );
};

const dropzoneStyles = {
  border: '2px dashed #cccccc',
  borderRadius: '4px',
  padding: '20px',
  textAlign: 'center',
  cursor: 'pointer',
};

const previewContainerStyles = {
  display: 'flex',
  marginTop: '20px',
  flexWrap: 'wrap',
};

const imageStyles = {
  width: '100px',
  height: '100px',
  margin: '8px',
  objectFit: 'cover',
  borderRadius: '4px',
};

export default ImageUploader;
